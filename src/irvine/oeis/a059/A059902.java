package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059902 Partitions encoded by interleaving bits in parts. The partition [P1+P2+P3+...] with P1&gt;=P2&gt;=P3&gt;=... is encoded in binary by recursively interleaving the bits of P1 with the (recursively interleaved bits of P2 with the (recursively...)).
 * @author Sean A. Irvine
 */
public class A059902 extends A059884 {

  private final Sequence mA = new A059901();

  @Override
  public Z next() {
    return encode(mA.next());
  }
}
