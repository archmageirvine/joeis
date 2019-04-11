package irvine.oeis.a110;

/**
 * A110782 Copies of <code>1,3,7</code> and 9 cyclically such that every partial concatenation is a prime.
 * @author Sean A. Irvine
 */
public class A110782 extends A110792 {

  @Override
  protected long[] candidates() {
    return new long[] {1, 3, 7, 9};
  }
}

