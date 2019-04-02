package irvine.oeis.a110;

/**
 * A110790 Copies of 3 and 1 alternately such that every partial concatenation is a prime.
 * @author Sean A. Irvine
 */
public class A110790 extends A110792 {

  @Override
  protected long[] candidates() {
    return new long[] {3, 1};
  }
}

