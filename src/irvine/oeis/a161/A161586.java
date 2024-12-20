package irvine.oeis.a161;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A161586 The list of the k values in the common solutions to the 2 equations 9*k+1=A^2, 13*k+1=B^2.
 * @author Georg Fischer
 */
public class A161586 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A161586() {
    super(1, "[0,-1,120,-120,1]", "[0,11,1320,157080]", 0);
  }
}
