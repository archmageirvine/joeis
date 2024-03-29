package irvine.oeis.a349;
// Generated by gen_seq4.pl satishol/holos at 2023-01-10 22:13

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349362 G.f. A(x) satisfies: A(x) = 1 + x * A(x)^6 / (1 + x).
 * @author Georg Fischer
 */
public class A349362 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349362() {
    super(0, "[[0],[-31342320,45446364,-25247980,6747305,-870620,43531],[-63609000,107375150,-70672945,22652680,-3533495,214530],[-40968600,83922410,-68270405,27446245,-5424655,419685],[-8609400,23325720,-25428870,13895080,-3776070,404060],[-227400,1275740,-2498530,2324995,-1055930,186405],[12720,-56326,84775,-29840,-38515,27906],[0,30,-125,-625,3125,-3125]]", "[1,1,5,40,370,3740]", 0);
  }
}
