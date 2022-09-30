package irvine.oeis.a171;
// manually holsig/holos at 2022-09-29

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A171116 a(n) is the Severi degree for curves of degree n and cogenus 6.
 * @author Georg Fischer
 */
public class A171116 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A171116() {
    super(1, "[0,1,-13,78,-286,715,-1287,1716,-1716,1287,-715,286,-78,13,-1]",
      "0,0,0,105,109781,12597900,302280963,3356773532,23599355991,122416062018,510681301550,1807308075111,5622246678741,15761274284852,40547443860105,97044388890450",
      0);
  }
}
