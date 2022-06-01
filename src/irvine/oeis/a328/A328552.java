package irvine.oeis.a328;
// manually 2021-01-27

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A328552 a(n) is the Severi degree for curves of degree n and cogenus 5.
 * @author Georg Fischer
 */
public class A328552 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328552() {
    super(1
      , "[0,-1, 11,-55, 165,-330, 462,-462, 330,-165, 55,-11, 1]"
      , "[0, 0, 0, 378, 90027, 2931831, 33720354, 224710119, 1068797961, 4037126346, 12886585236, 36161763120, 91629683271, 213681907449]"
      , 0);
  }
}
