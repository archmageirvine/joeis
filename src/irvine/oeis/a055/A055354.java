package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055354 Number of labeled mobiles (circular rooted trees) with n nodes and 7 leaves.
 * @author Georg Fischer
 */
public class A055354 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055354() {
    super(8, A055350.computeRecurrence(7), "5760, 940896, 85049280, 5731545600, 324745027200, 16481262283200, 778208622871680, 35036455255401600, 1529404526377728000, 65498410076875776000, 2775672164602681344000, 117137057625636739891200, 4946387751331123249152000, 209766165764553870151680000");
    setGfType(1);
  }
}

