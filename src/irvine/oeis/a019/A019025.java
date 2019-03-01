package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019025.
 * @author Sean A. Irvine
 */
public class A019025 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // LEV
    return "a-1: a-14(000) a-12(000) b-8(000) b-4(000)\n"
      + "b-4: b-18(000) b-17(+-0) b-7(0-0)\n"
      + "b-8: b-15(000) b-13(+-0)\n"
      + "a-12: b-16(000) b-15(000)\n"
      + "a-14: b-18(000)\n"
      + "b-2: b-18(-0+) b-16(000) b-8(-00) a-5(000)\n"
      + "a-5: a-12(000) a-10(000) b-9(000)\n"
      + "a-3: a-14(000) a-10(000) b-7(000) b-6(000)\n"
      + "b-6: b-17(000) b-16(0+-) b-9(00-)\n"
      + "b-7: b-15(0+-) b-11(000)\n"
      + "a-10: b-17(000) b-13(000)\n"
      + "b-9: b-13(000) b-11(-0+)\n"
      + "b-11: b-17(+00) a-14(000)\n"
      + "b-15: b-18(00+)\n"
      + "b-13: b-16(0+0)\n";
  }
}

