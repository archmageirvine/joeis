package irvine.oeis.a289;
// manually 2025-04-02

import irvine.oeis.Conjectural;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A289451 Related to number of mesh patterns of length 2 that avoid the pattern 231.
 * @author Georg Fischer
 */
public class A289451 extends HolonomicRecurrence implements Conjectural {

  /** Construct the sequence. */
  public A289451() {
    super(1, "[[0],[330,-126,12],[-168,-3,9],[-444,177,-15],[-14,63,-25],[38,-65,27],[0,7,-9],[0,1,1]]", "1,1,1,2", 1, 0);
  }
}
