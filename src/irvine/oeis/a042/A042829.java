package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042829 Denominators of continued fraction convergents to <code>sqrt(945)</code>.
 * @author Sean A. Irvine
 */
public class A042829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042829() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 551122, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 27, 328, 1995, 2323, 6641, 8964, 544481, 553445, 1651371, 2204816, 14880267, 180768020, 1099488387, 1280256407, 3660001201L, 4940257608L});
  }
}
