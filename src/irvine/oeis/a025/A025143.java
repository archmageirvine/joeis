package irvine.oeis.a025;

/**
 * A025143 Unique sequence a such that a(1) = 2 and r(r(a)) = a != r(a), where for any sequence s of 1's and 2's, r(s(n) := length of n-th run of same symbols in s; r(a) is sequence A025142.
 * @author Sean A. Irvine
 */
public class A025143 extends A025142 {

  @Override
  protected boolean select(final long n) {
    return mA025143.isSet(n);
  }
}
