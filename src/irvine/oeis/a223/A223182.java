package irvine.oeis.a223;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A223182 Rolling icosahedron footprints: number of n X 4 0..11 arrays starting with 0 where 0..11 label vertices of an icosahedron and every array movement to a horizontal, vertical or antidiagonal neighbor moves along an icosahedral edge.
 * @author Georg Fischer
 */
public class A223182 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A223182() {
    super(1, "[0,125,-930,2005,-2740,1400,-180]", "[1,-10,25,-36,24,-4]");
  }
}
