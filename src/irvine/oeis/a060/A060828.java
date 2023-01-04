package irvine.oeis.a060;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a038.A038500;

/**
 * A060828 Size of the Sylow 3-subgroup of the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A060828 extends PartialProductSequence {

  /** Construct the sequence. */
  public A060828() {
    super(new PrependSequence(new A038500(), 1));
  }
}
