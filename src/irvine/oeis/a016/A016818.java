package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016818 (4n+1)^6.
 * @author Sean A. Irvine
 */
public class A016818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016818() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 15625, 531441, 4826809, 24137569, 85766121, 244140625});
  }
}
