package irvine.oeis.a018;

/**
 * A018956 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite AFO = AlPO4-41 [ Al20P20O80 ].
 * @author Sean A. Irvine
 */
public class A018956 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AFO
    return "a-1: a-18(000) d-12(0++) c-11(00+) b-10(00+)\n"
      + "b-10: a-19(00-)\n"
      + "c-11: a-19(00-)\n"
      + "d-12: a-19(+0-)\n"
      + "b-2: a-17(00+) b-14(000) b-10(00+) a-9(00+)\n"
      + "a-9: a-20(000)\n"
      + "b-14: a-20(000)\n"
      + "c-3: a-17(00+) c-15(000) d-12(00+) a-9(00+)\n"
      + "c-15: a-20(000)\n"
      + "d-4: a-17(0++) d-16(000) c-11(00+) a-9(-0+)\n"
      + "d-16: a-20(-00)\n"
      + "a-5: a-17(000) d-16(0-0) c-15(000) b-14(000)\n"
      + "b-6: a-18(000) b-14(000) a-13(000) b-10(000)\n"
      + "a-13: a-19(000)\n"
      + "c-7: a-18(000) d-16(000) a-13(000) c-11(000)\n"
      + "d-8: a-18(0-0) c-15(000) a-13(+00) d-12(000)\n";
  }

  @Override
  protected String startNode() {
    return "d-4";
  }
}

