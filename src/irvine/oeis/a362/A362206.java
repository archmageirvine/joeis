package irvine.oeis.a362;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A362206 Expansion of 1/(1 - x/(1-9*x)^(1/3)).
 * @author Georg Fischer
 */
public class A362206 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A362206() {
    super(0, "[[0],[-7722,5175,-1134,81],[804,-762,216,-18],[-69512,46598,-10216,730],[14958,-12033,3078,-243],[-930,969,-306,27],[14,-23,10,-1]]", "[1,1,4,25,181,1399,11212,91936]", 0);
  }
}
