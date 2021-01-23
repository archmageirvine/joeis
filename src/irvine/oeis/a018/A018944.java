package irvine.oeis.a018;

/**
 * A018944 Cycle class sequence c(2n) (the number of true cycles of length 2n in which a certain node is included) for zeolite AEL = AlPO4-11 [ Al20P20O80 ].
 * @author Sean A. Irvine
 */
public class A018944 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AEL
    return "a-1: b-18(000) a-17(0++) b-14(-00) a-10(0+0)\n"
      + "a-10: b-20(000) b-16(000) a-15(0-0)\n"
      + "b-2: b-18(000) a-17(000) a-13(-00) c-6(000)\n"
      + "c-6: b-20(000) c-9(--0)\n"
      + "a-13: a-19(0-0)\n"
      + "c-3: b-18(00-) c-12(-0-) c-6(0+0) b-5(000)\n"
      + "b-5: b-20(00-) a-19(000) a-15(000)\n"
      + "c-12: b-16(000)\n"
      + "a-4: b-20(000) a-19(0-0) b-16(000) a-7(000)\n"
      + "a-7: b-18(+00) b-14(000) a-13(0++)\n"
      + "a-15: a-17(000)\n"
      + "c-9: b-14(000) c-12(0+0) b-11(000)\n"
      + "b-8: a-17(+00) b-14(000) a-13(000) c-12(00-)\n"
      + "b-11: a-19(000) b-16(00-) a-15(000)\n";
  }

  @Override
  protected String startNode() {
    return "c-3";
  }
}

