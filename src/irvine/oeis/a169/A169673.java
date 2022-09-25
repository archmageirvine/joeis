package irvine.oeis.a169;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A169673 Lexicographically earliest de Bruijn sequence for n = 7 and k = 2.
 * @author Georg Fischer
 */
public class A169673 extends PeriodicSequence {

  /** Construct the sequence. */
  public A169673() {
    super("0,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,1,0,0,0,1,1,0,1,0,0,0,1,1,1,1,0,0,1,0,0,1,1,0"
      + ",0,1,0,1,0,1,0,0,1,0,1,1,1,0,0,1,1,0,1,1,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,1,0,1,0,1,1,0,1,0,1,1,1,1,0,1,1,0,1,1,1,0,1,1,1,1,1,1,1");
  }
}
