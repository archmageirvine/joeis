package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055353 Number of labeled mobiles (circular rooted trees) with n nodes and 6 leaves.
 * @author Georg Fischer
 */
public class A055353 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055353() {
    super(7, A055350.computeRecurrence(6), "840, 98784, 6618528, 339111360, 14931378000, 600119150400, 22811289621120, 838683494288640, 30275663821603200, 1084273458428160000, 38808699592126464000, 1395650171787308236800");
    setGfType(1);
  }
}

