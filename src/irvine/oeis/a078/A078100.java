package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078100 <code>1/6</code> of the number of ways of 3-coloring <code>a 4</code> X n grid.
 * @author Sean A. Irvine
 */
public class A078100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078100() {
    super(new long[] {6, -15, 9}, new long[] {4, 27, 187});
  }
}
