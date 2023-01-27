package irvine.oeis.a119;
// manually etaprod at 2023-01-23 09:32

import irvine.oeis.transform.EtaProductSequence;

/**
 * A119952 Number of partitions of n into parts relatively prime to 63 and not == 2 (mod 4).
 * Eta product <code>q^6*eta(q^2)*eta(q^7)*eta(q^9)*eta(q^28)*eta(q^36)*eta(q^126)/eta(q)/eta(q^4)/eta(q^14)/eta(q^18)/eta(q^63)/eta(q^252)</code>
 * @author Georg Fischer
 */
public class A119952 extends EtaProductSequence {

  /** Construct the sequence. */
  public A119952() {
    super(0, "[126,1;36,1;28,1;9,1;7,1;2,1;252,-1;63,-1;18,-1;14,-1;4,-1;1,-1]", "6/1");
  }
}
