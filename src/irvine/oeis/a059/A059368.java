package irvine.oeis.a059;

import irvine.oeis.FiniteSequence;

/**
 * A059368 Triangle arising from solution to a*x = tan x (next row contains non-integral entries).
 * @author Georg Fischer
 */
public class A059368 extends FiniteSequence {

  /** Construct the sequence. */
  public A059368() {
    super(1, 1, 3, 3, 20, 30, 15, 161, 525, 525, 105, 1584, 8232, 17640, 13230, 945, 18579, 134970, 457380, 727650, 436590);
  }
}
