package irvine.oeis.a018;

/**
 * A018994 Cycle class sequence c(2n) (the number of true cycles of length 2n in which a certain node is included) for zeolite BPH = Beryllophosphate-H Na7K7 [ Be14P14O56 ] . 20 H2O.
 * @author Sean A. Irvine
 */
public class A018994 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // BPH
    return "a-1: c-28(000) c-26(000) c-24(000) a-4(00-)\n"
      + "a-4: c-21(000) c-19(000) c-17(000)\n"
      + "b-2: c-28(000) c-24(000) b-23(000) b-9(000)\n"
      + "b-9: c-21(000) b-20(000) c-19(000)\n"
      + "c-3: b-27(000) c-24(000) b-23(000) a-22(000)\n"
      + "b-5: c-21(000) c-17(000) b-16(-00) b-11(000)\n"
      + "b-11: c-26(000) b-25(-00) c-24(000)\n"
      + "b-16: b-25(000)\n"
      + "c-6: b-20(000) c-17(+00) b-16(000) a-15(000)\n"
      + "a-15: a-22(00+)\n"
      + "b-20: b-23(000)\n"
      + "b-7: c-28(000) b-27(0+0) c-26(000) b-13(000)\n"
      + "b-13: c-19(000) b-18(0+0) c-17(000)\n"
      + "c-8: c-28(0-0) b-27(000) b-25(000) a-22(000)\n"
      + "c-10: c-21(000) b-20(000) b-18(000) a-15(000)\n"
      + "b-18: b-27(000)\n"
      + "c-12: c-26(+00) b-25(000) b-23(000) a-22(000)\n"
      + "c-14: c-19(0-0) b-18(000) b-16(000) a-15(000)\n";
  }
}

