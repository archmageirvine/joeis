package irvine.oeis.a322;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A322328 a(n) = A005361(n) * 4^A001221(n) for n &gt; 0.
 * @author Georg Fischer
 */
public class A322328 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A322328() {
    super(1, (p, e) -> Z.valueOf(4L * e));
  }
}
