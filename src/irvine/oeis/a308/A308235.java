package irvine.oeis.a308;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A308235 Take apart the sides of each of the integer-sided scalene triangles with perimeter n (at their vertices) and rearrange them orthogonally in 3-space so that their endpoints coincide at a single point. a(n) is the total surface area of all rectangular prisms enclosed in this way.
 * @author Georg Fischer
 */
public class A308235 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A308235() {
    super(1, "[0,0,0,0,0,0,0,0,0,52,104,180,194,188,142,112,62,34,10,2]", "[1,2,2,-1,-7,-10,-7,5,17,19,9,-9,-19,-17,-5,7,10,7,1,-2,-2,-1]");
  }
}
