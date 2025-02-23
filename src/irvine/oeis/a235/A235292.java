package irvine.oeis.a235;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A235292 Number of (n+1) X (2+1) 0..3 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 3 (constant-stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A235292 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A235292() {
    super(1, "[0,108,-92,-2056,1916,13580,-13472,-36408,37296,33408,-34560]", "[1,-3,-17,57,86,-372,-76,972,-360,-864,576]");
  }
}
