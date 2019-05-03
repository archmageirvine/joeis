package irvine.oeis.a018;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A018785 Entries of <code>A001273</code> with trailing <code>9</code>'s stripped (at <code>n=13</code> term becomes periodic with period <code>49)</code>.
 * @author Sean A. Irvine
 */
public class A018785 extends PrependSequence {

  /** Construct the sequence. */
  public A018785() {
    super(new PeriodicSequence(2, 688, 26, 15, 128, 57, 188, 15, 2688, 2688, 888888, 277, 37888, 56, 25, 5, 12, 258, 178, 46, 8, 58, 2588, 17, 77, 17, 77, 17, 77, 88888, 7, 5, 12, 1688, 18888, 178, 37888, 46, 38, 18, 36, 6, 2688, 288, 488, 25, 8888888, 25, 7888), 1, 10, 13, 23, 1, 7, 356, 78, 3788, 78888, 258, 888888, 157);
  }
}
