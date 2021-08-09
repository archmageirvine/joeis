package irvine.oeis.a050;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050203 a(n) is the coefficient of the term a^(-n) in the asymptotic series for the least positive zero of the generalized Rogers-Ramanujan continued fraction.
 * @author Sean A. Irvine
 */
public class A050203 implements Sequence {

  // After Kok Seng Chua

  private static final PolynomialRingField<Z> RING_Q = new PolynomialRingField<>("q", IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING_X = new PolynomialRingField<>(RING_Q);
  private final ArrayList<Z> mS = new ArrayList<>();
  {
    mS.add(null);
  }
  private int mN = 0;

  private Z rr(final int n) {
    Polynomial<Polynomial<Z>> w = RING_X.one();
    Polynomial<Polynomial<Z>> p = RING_X.one();
    Polynomial<Polynomial<Z>> po = RING_X.one();

    // for(i=1, n, w=p-po*x*q^i; po=p; p=w);
    for (int i = 1; i <= n; ++i) {
      w = RING_X.subtract(p, RING_X.multiply(po, RING_X.monomial(RING_Q.monomial(Z.ONE, i), 1), n));
      po = p;
      p = w;
    }
    System.out.println("w=" + w);

    final int m = w.degree();
    Polynomial<Polynomial<Z>> w1 = RING_X.zero();
    for (int i = 0; i <= m; ++i) {
      final Polynomial<Z> h = w.coeff(i);
      Polynomial<Z> h1 = RING_Q.zero();
      for (int j = 1; j <= n - 1 + i; ++j) {
        h1 = RING_Q.add(h1, RING_Q.monomial(h.coeff(j), j));
      }
      w1 = RING_X.add(w1, RING_X.monomial(h1, i));
    }
    System.out.println("w1=" + w1);

    Polynomial<Z> q = RING_Q.zero();
    for (int i = 1; i < n; ++i) {
      q = RING_Q.series(RING_Q.add(q.shift(i), RING_Q.monomial(mS.get(i), 0)), RING_Q.monomial(Z.ONE, i), n);
    }
    System.out.println("q=" + q);

    // Ugh, there is a very complicated substitution happening here
    // q in w1 is actually replaced by the output from above loop!

    final Polynomial<Z> h2 = RING_X.coeff(RING_X.one(), w1, n - 1);
    System.out.println("h2=" + h2);

    return Z.ZERO;

  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mS.add(Z.ONE);
    } else {
      mS.add(rr(mN));
    }
    return mS.get(mS.size() - 1);
  }
}

/*
{RR(n, w, z, p, po, i, m, h, h1, j, w1, h2)=w=1+O(x^(n+1)); p=1; po =1; for(i=1, n, w=p-po*x*q^i; po=p; p=w);
 m=poldegree(w);
  w1=0;
 for(i=0, m, h=polcoeff(w, i); h1=0; for (j=1, n-1+i, h1=h1+polcoeff(h, j)*q^j); w1=w1+h1*x^i);
 q=0;
 for (i=1, n-1, q=q+s[i]/x^i);
 q=q+y/x^n;
 z=eval(w1);
 kill(q);
 h2=polcoeff(z, -(n-1));
 polcoeff(h2, 1)*polcoeff(h2, 0)*(-1)
 }

 s=vector(30); s[1]=1; print(s[1]); for (j=2, 30, s[j]=RR(j); print(s[j]));
 */
