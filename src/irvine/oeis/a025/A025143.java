package irvine.oeis.a025;

/**
 * A025143 Unique sequence a such that <code>a(1) = 2</code> and <code>r(r(a)) = a != r(a)</code>, where for any sequence s of <code>1</code>'s and <code>2's, r(s(n) :=</code> length of n-th run of same symbols in s; <code>r(a)</code> is sequence <code>A025142</code>.
 * @author Sean A. Irvine
 */
public class A025143 extends A025142 {

  @Override
  protected boolean select(final long n) {
    return mA025143.isSet(n);
  }
}
