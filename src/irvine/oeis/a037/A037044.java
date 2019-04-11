package irvine.oeis.a037;

import irvine.oeis.FiniteSequence;

/**
 * A037044 4-white numbers: partition digits of <code>n^4</code> into blocks of 4 starting at right; sum of these 4-digit numbers equals n.
 * @author Georg Fischer
 */
public class A037044 extends FiniteSequence {

  /** Construct the sequence. */
  public A037044() {
    super(0, 1, 4950, 5050, 11110, 14443, 15049, 16060, 17776, 18382, 19393, 19998, 19999, 21109, 22726, 25048, 28381, 35047);
  }
}
