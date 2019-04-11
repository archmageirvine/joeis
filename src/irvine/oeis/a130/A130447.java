package irvine.oeis.a130;

import irvine.oeis.FiniteSequence;

/**
 * A130447 Numbering the days of a 365-day year from 1 (Jan <code>01)</code> to 365 (Dec <code>31),</code> these are the days that start months.
 * @author Georg Fischer
 */
public class A130447 extends FiniteSequence {

  /** Construct the sequence. */
  public A130447() {
    super(1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335);
  }
}
