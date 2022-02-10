package irvine.oeis.a340;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000055;
import irvine.oeis.transform.EulerTransformSequence;

/**
 * A340814.
 * @author Sean A. Irvine
 */
public class A340811 extends A340812 {

  private int mN = -1;
  private int mM = 0;

  private Polynomial<Z> p(final Polynomial<Z> p, final int k) {
    return p.substitutePower(k, p.degree());
  }

  private Polynomial<Z> shiftedEulerTransform(final Polynomial<Z> t) {
    final Polynomial<Z> res = RING.empty();
    //res.add(Z.ONE);
    final Sequence et = new EulerTransformSequence(new FiniteSequence(t), 1);
    for (int j = 0; j <= t.degree(); ++j) {
      res.add(et.next());
    }
    //System.out.println("et=" + res);
    return res;
  }


  protected Polynomial<Z> s(final Polynomial<Z> p, final int k) {
    final int n = p.degree();
    final Polynomial<Z> p2 = p(p, 2);
    if ((k & 1) == 1) {
      // odd
      final Polynomial<Z> t = RING.add(RING.pow(p2, k / 2, n).shift(1), RING.divide(RING.subtract(RING.pow(p2, k - 1, n), RING.pow(p(p, 4), k / 2, n)), Z.TWO).shift(2));
      //System.out.println("Doing odd t=" + t);
      return shiftedEulerTransform(t);
    } else {
      // even
      final Polynomial<Z> r = RING.pow(p2, k / 2 - 1);
      Polynomial<Z> q = RING.one();
      for (int j = 0; j < r.degree(); ++j) { //while (q.degree() < r.degree()) {
        //System.out.println("r=" + r);
        //System.out.println("q=" + q);
        final Polynomial<Z> t = RING.multiply(r, q);
        final Polynomial<Z> u = RING.add(t.shift(1), RING.divide(RING.subtract(RING.pow(p, k - 1), t).substitutePower(2, n), Z.TWO).shift(2));
        //System.out.println("u=" + u);
        q = shiftedEulerTransform(u);
      }
      return RING.add(q, RING.divide(RING.multiply(RING.pow(p2, k / 2 - 1, n), RING.subtract(p2, RING.pow(q, 2, n)), n), Z.TWO).shift(1));
    }
  }

  /*
  S(p, k)={my(p2=p(2));
     if(k%2,
       1+x*Ser(EulerT(Vec(x*p2^(k\2) + x^2*(p2^(k-1) - p(4)^(k\2))/2 ))),
        my(r=p2^(k/2-1),
           q=1+O(x));
         while(serprec(q, x)<serprec(p2, x),
            my(t=r*q);
            q=1+x*Ser( EulerT[ Vec(x*t + x^2*subst(p(1)^(k-1) - t, x, x^2)/2) ] )
         );
         q + x*p2^(k/2-1)*(p2-q^2)/2
     )
    }
   */

  private final MemorySequence mA55 = MemorySequence.cachedSequence(new A000055());

  private Polynomial<Z> u(final int n, final int k) {
    if (k == 2) {
      mA55.a(n);
      return mA55.polynomial().truncate(n).shift(-1);
    }
    final Polynomial<Z> p = b(n, k);
//    System.out.println("c=" + c(p, n, k));
//    System.out.println("s=" + s(p, k));
    return RING.divide(RING.add(c(p, n, k), s(p, k)), Z.TWO);
  }

  // U(n, k)={my(b=B(n, k), p(d)=subst(b + O(x*x^(n\d)), x, x^d)); Vec(C(p, k) + S(p, k))/2}
//{ Mat(vector(7, k, U(7, k+1)~)) }

  @Override
  public Z next() {
//    for (int k = 2; k < 10; ++k) {
//      System.out.println(u(10, k));
//    }

    // todo Looks like k=2 is wrongs, others are ok

    //System.out.println("S(4)=" + s(Polynomial.create(1, 1, 2, 5, 7, 18), 4));
    //System.out.println(u(10, 3));
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return u(mM + 5, mN - mM + 2).coeff(mM);
  }
}

