package irvine.oeis.a110;

/**
 * A110776 Copies of 1 and 7 alternately such that every partial concatenation is a prime.
 * @author Sean A. Irvine
 */
public class A110776 extends A110792 {

  @Override
  protected long[] candidates() {
    return new long[] {1, 7};
  }
}

