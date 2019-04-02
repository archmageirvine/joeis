package irvine.oeis.a110;

/**
 * A110780 Copies of 1 and 9 alternately such that every partial concatenation is a prime.
 * @author Sean A. Irvine
 */
public class A110780 extends A110792 {

  @Override
  protected long[] candidates() {
    return new long[] {1, 9};
  }
}

