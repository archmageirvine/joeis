package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019259 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite VSV = VPI-7 Na26H6[ Zn16Si56O144 <code>] </code>. 44 H2O.
 * @author Sean A. Irvine
 */
public class A019259 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // VSV
    return "a-1: a-17(000) a-10(-0-) b-5(0-0) a-4(000)\n"
      + "a-4: b-18(000) b-11(0--)\n"
      + "b-5: a-17(00-) a-10(0+0) c-6(000)\n"
      + "a-10: b-18(000) a-17(000)\n"
      + "b-2: b-18(-0-) b-11(000) a-4(000) c-3(000)\n"
      + "c-3: c-16(000) a-14(000) b-11(000)\n"
      + "b-11: b-18(-+0)\n"
      + "a-14: c-16(000)\n"
      + "c-6: a-17(00-) b-13(000) b-8(00-)\n"
      + "b-8: b-15(-00) b-13(00+) c-9(-00)\n"
      + "b-13: b-15(000)\n"
      + "a-7: c-16(+-0) a-14(0--) a-12(000) c-9(000)\n"
      + "c-9: b-15(0--) b-13(000)\n"
      + "a-12: c-16(+0+) b-15(000) a-14(000)\n";
  }
}

