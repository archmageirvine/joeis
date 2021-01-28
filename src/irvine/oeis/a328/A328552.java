package irvine.oeis.a328;
// manually 2021-01-27

import irvine.oeis.HolonomicRecurrence;

/**
 * A328552 a(n) = (81/40)*n^10 - (81/4)*n^9 - (27/8)*n^8 + (2349/4)*n^7 - (1044)*n^6 - (127071/20)*n^5 + (128859/8)*n^4 + (59097/2)*n^3 - (3528381/40)*n^2 - (946929/20)*n + 153513.
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
