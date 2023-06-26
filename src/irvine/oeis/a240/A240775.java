package irvine.oeis.a240;

import irvine.oeis.FiniteSequence;

/**
 * A240775 The six values n in each interval [i*840, (i+1)*840), where i &gt;= 0, for which Mordell's formulas do NOT provide a three-Egyptian-fraction solution for 4/n.
 * @author Georg Fischer
 */
public class A240775 extends FiniteSequence {

  /** Construct the sequence. */
  public A240775() {
    super(1, FINITE, 1, 121, 169, 289, 361, 529);
  }
}
