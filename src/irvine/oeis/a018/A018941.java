package irvine.oeis.a018;

/**
 * A018941 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite AEI = AlPO4-18 [ Al24P24O96 ].
 * @author Sean A. Irvine
 */
public class A018941 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AEI
    return "a-1: c-21(000) a-19(--0) a-16(000) b-8(0-0)\n"
      + "b-8: c-15(0++) b-14(000)\n"
      + "a-16: b-23(0-0)\n"
      + "b-2: c-21(+0-) b-20(000) c-9(000) a-7(+00)\n"
      + "a-7: a-22(000) c-15(000) a-13(--0)\n"
      + "c-9: b-14(+0-) a-13(000)\n"
      + "c-3: b-20(0++) a-19(000) c-9(00+) b-8(000)\n"
      + "a-4: c-24(000) a-22(++0) a-13(000) b-11(0+0)\n"
      + "b-11: c-18(0-0) b-17(000)\n"
      + "a-13: b-20(0+0)\n"
      + "b-5: c-24(-00) b-23(000) c-12(000) a-10(-00)\n"
      + "a-10: a-19(000) c-18(000) a-16(++0)\n"
      + "c-12: b-17(-00) a-16(000)\n"
      + "c-6: b-23(0-0) a-22(000) c-12(000) b-11(000)\n"
      + "c-15: c-21(00-) b-20(000)\n"
      + "b-14: c-21(000) a-19(-00)\n"
      + "c-18: c-24(000) b-23(000)\n"
      + "b-17: c-24(000) a-22(+00)\n";
  }

  @Override
  protected String startNode() {
    return "c-3";
  }
}

