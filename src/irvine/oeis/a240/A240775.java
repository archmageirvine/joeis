package irvine.oeis.a240;

import irvine.oeis.FiniteSequence;

/**
 * A240775 The six values n in each interval <code>[i*840, (i+1)*840)</code>, where i <code>&gt;= 0</code>, for which Mordell's formulas do NOT provide a <code>three-Egyptian-fraction</code> solution for <code>4/n</code>.
 * @author Georg Fischer
 */
public class A240775 extends FiniteSequence {

  /** Construct the sequence. */
  public A240775() {
    super(1, 121, 169, 289, 361, 529);
  }
}
