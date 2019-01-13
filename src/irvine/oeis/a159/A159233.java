package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159233.
 * @author Sean A. Irvine
 */
public class A159233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159233() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {0, 0, 0, 0, 49920, 18936480, 1293857280, 34839270480L, 518880929280L, 5122755187200L, 37376074229760L, 216261381584160L, 1041571537839360L, 4323020652281760L, 15864787390932480L, 52496402135289840L});
  }
}
