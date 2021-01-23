package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118879 Let T(S,Q) be the sequence obtaining by starting with S and repeatedly reversing the digits and adding Q to get the next term. This is T(1016,5), the first S for which T(S,5) reaches a cycle of length 36.
 * @author Sean A. Irvine
 */
public class A118879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118879() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1016, 6106, 6021, 1211, 1126, 6216, 6131, 1321, 1236, 6326, 6241, 1431, 1346, 6436, 6351, 1541, 1456, 6546, 6461, 1651, 1566, 6656, 6571, 1761, 1676, 6766, 6681, 1871, 1786, 6876, 6791, 1981, 1896, 6986, 6901, 1101});
  }
}
