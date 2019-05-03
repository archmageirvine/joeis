package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A010350 Base 7 Armstrong or narcissistic numbers (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A010350 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010350() {
    super(Z.ONE, Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.SIX, Z.TEN,
      new Z("25"),
      new Z("32"),
      new Z("45"),
      new Z("133"),
      new Z("134"),
      new Z("152"),
      new Z("250"),
      new Z("3190"),
      new Z("3222"),
      new Z("3612"),
      new Z("3613"),
      new Z("4183"),
      new Z("9286"),
      new Z("35411"),
      new Z("191334"),
      new Z("193393"),
      new Z("376889"),
      new Z("535069"),
      new Z("794376"),
      new Z("8094840"),
      new Z("10883814"),
      new Z("16219922"),
      new Z("20496270"),
      new Z("32469576"),
      new Z("34403018"),
      new Z("416002778"),
      new Z("416352977"),
      new Z("420197083"),
      new Z("725781499"),
      new Z("1500022495"),
      new Z("15705029375"),
      new Z("15705029376"),
      new Z("28700208851"),
      new Z("970930659537"),
      new Z("972004335826"),
      new Z("1003624386355"),
      new Z("1443220146575"),
      new Z("1504283967871"),
      new Z("2352056093102"),
      new Z("36940082141157"),
      new Z("51612024946703"),
      new Z("52323166511954"),
      new Z("102340463411217"),
      new Z("1847703627580701"),
      new Z("2514834742553772"),
      new Z("3123368686057682"),
      new Z("132116164569671440"),
      new Z("3984625384955273973"),
      new Z("4008396591708493297"),
      new Z("4798127097158078159"),
      new Z("4798127097158078160"),
      new Z("5528252581301500133")
    );
  }
}
