package irvine.oeis.a018;

/**
 * A018979 Cycle class sequence <code>c(2n) (the</code> number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite APD <code>= AlPO4-D [ Al16P16O64 ]</code>.
 * @author Sean A. Irvine
 */
public class A018979 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // APD
    return "a-1: a-13(000) a-9(0--) a-7(0-0) b-2(000)\n"
      + "b-2: b-14(--0) b-8(000) b-6(00-)\n"
      + "a-7: a-15(0+0) a-11(000) b-8(0+0)\n"
      + "a-9: a-15(0+0) b-10(000)\n"
      + "a-13: b-14(000)\n"
      + "b-6: b-10(--0)\n"
      + "b-8: b-12(000)\n"
      + "a-3: a-15(000) a-11(+00) a-5(+00) b-4(+00)\n"
      + "b-4: b-16(000) b-8(000) b-6(000)\n"
      + "a-5: a-13(-0+) a-9(000) b-6(000)\n"
      + "a-11: a-13(-00) b-12(-00)\n"
      + "a-15: b-16(0-0)\n"
      + "b-10: b-16(000) b-14(00+)\n"
      + "b-12: b-16(000) b-14(000)\n";
  }
}

