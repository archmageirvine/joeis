package irvine.oeis.a110;

/**
 * A110778 Copies of 3 and 7 alternately such that every partial concatenation is a prime.
 * @author Sean A. Irvine
 */
public class A110778 extends A110792 {

  @Override
  protected long[] candidates() {
    return new long[] {3, 7};
  }
}

