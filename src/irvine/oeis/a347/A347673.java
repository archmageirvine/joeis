package irvine.oeis.a347;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A347673 Number of Baxter matrices of size 3 X n.
 * @author Georg Fischer
 */
public class A347673 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A347673() {
    super(1, "[0,1,-5,10,-10,5,-1]", "1,14,69,203,463,903,1585", 0);
  }
}
