package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024191 [ (3rd elementary symmetric function of <code>3,4,...,n+4)/(3+4+...+n+4) ]</code>.
 * @author Sean A. Irvine
 */
public class A024191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024191() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {5, 19, 47, 95, 170});
  }
}
