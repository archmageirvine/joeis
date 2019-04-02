package irvine.oeis.a110;

/**
 * A110788 Copies of 7 and 1 alternately such that every partial concatenation is a prime.
 * @author Sean A. Irvine
 */
public class A110788 extends A110792 {

  @Override
  protected long[] candidates() {
    return new long[] {7, 1};
  }
}

