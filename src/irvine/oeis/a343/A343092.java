package irvine.oeis.a343;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a342.A342989;

/**
 * A342989.
 * @author Sean A. Irvine
 */
public class A343092 extends A342989 {

  // After Andrew Howroyd

  private int mN = 1;
  private int mM = 1;
  private Polynomial<Z> mRow = RING.zero();


  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      ++mN;
      mM = 0;
      final Polynomial<Polynomial<Polynomial<Z>>> q = XRING.subtract(g(mN, 1), XRING.x());
      System.out.println("q=" + q);
      final Polynomial<Polynomial<Polynomial<Z>>> t = XRING.series(XRING.x(), XRING.pow(q, 2, mN + 1), mN + 1);
      final Polynomial<Polynomial<Polynomial<Z>>> rev = XRING.reversion(t, mN + 1).shift(-1);
      System.out.println("rev=" + rev);
      // todo the following stalls -- I thought may be due to Z[x] where sqrt has known problems
      // but this is worse Z[x,y,z]
      final Polynomial<Polynomial<Polynomial<Z>>> sqrt = XRING.sqrt(rev, mN + 1);
      //final Polynomial<Polynomial<Polynomial<Z>>> sqrt = rev; // todo bogus
      mRow = sqrt.coeff(mN).coeff(1);
    }
    return mRow.coeff(mM);
  }
}

/*
G(n, m, y, z)={my(p=F(n, m, y, z)); subst(p, x, serreverse(x*p^2))}

H(n, g=1)={my(q=G(n, g, 'y, 'z)-x, v=Vec(polcoef(sqrt(serreverse(x/q^2)/x), g, 'y))); [Vecrev(t) | t<-v]}

{ my(T=H(10)); for(n=1, #T, print(T[n])) }
 */
