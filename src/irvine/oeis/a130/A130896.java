package irvine.oeis.a130;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A130896 For D_n type groups as polyhedra that are pyramid-like: {F,V,E,dimension}-&gt;{2*n+1,2*n+1,4*n,(2*n+1)*((2*n+1)-1)/2} such that Euler's equation is true: V=E-F+2.
 * @author Georg Fischer
 */
public class A130896 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A130896() {
    super(1, "[0,3,3,4,3,-4,-4,-4,1,1,1]", "[1,0,0,0,-3,0,0,0,3,0,0,0,-1]");
  }
}
