package irvine.oeis.a025;

/**
 * A025143 Unique sequence a of 1's and 2's such that a(1) = 2 and r(r(a)) = a != r(a), where for any sequence s, r(s) is the sequence of lengths of runs of same symbols in s; r(a) is sequence A025142.
 * @author Sean A. Irvine
 */
public class A025143 extends A025142 {

  @Override
  protected boolean select(final long n) {
    return mA025143.isSet(n);
  }
}
