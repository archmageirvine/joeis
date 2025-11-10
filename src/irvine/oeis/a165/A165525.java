package irvine.oeis.a165;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A165525 Number of permutations of length n which avoid the patterns 4321 and 2143.
 * @author Georg Fischer
 */
public class A165525 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A165525() {
    super(0, "[0,-16,192,-1032,3304,-7049,10602,-11579,9305,-5505,2369,-721,147,-18,1]", "[1,1,2,6,22,86,333,1235,4339,14443,45770,138988,407134]", 0);
  }
}
