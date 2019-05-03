package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134289 Eighth column (and diagonal) of Narayana triangle <code>A001263</code>.
 * @author Sean A. Irvine
 */
public class A134289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134289() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {1, 36, 540, 4950, 32670, 169884, 736164, 2760615, 9202050, 27810640, 77364144, 200443464, 488259720, 1126753200, 2478857040L});
  }
}
