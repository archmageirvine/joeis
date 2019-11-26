package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A010349 Base 7 Armstrong or narcissistic numbers, written in base 7.
 * @author Sean A. Irvine
 */
public class A010349 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010349() {
    super(Z.ONE, Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.SIX,
      new Z("13"),
      new Z("34"),
      new Z("44"),
      new Z("63"),
      new Z("250"),
      new Z("251"),
      new Z("305"),
      new Z("505"),
      new Z("12205"),
      new Z("12252"),
      new Z("13350"),
      new Z("13351"),
      new Z("15124"),
      new Z("36034"),
      new Z("205145"),
      new Z("1424553"),
      new Z("1433554"),
      new Z("3126542"),
      new Z("4355653"),
      new Z("6515652"),
      new Z("125543055"),
      new Z("161340144"),
      new Z("254603255"),
      new Z("336133614"),
      new Z("542662326"),
      new Z("565264226"),
      new Z("13210652042"),
      new Z("13213641035"),
      new Z("13261421245"),
      new Z("23662020022"),
      new Z("52112660266"),
      new Z("1064120355440"),
      new Z("1064120355441"),
      new Z("2034134515166"),
      new Z("130101365302206"),
      new Z("130140113350606"),
      new Z("132336514346053"),
      new Z("206161224560204"),
      new Z("213452362516546"),
      new Z("331634066630612"),
      new Z("10531555446303336"),
      new Z("13604563043402624"),
      new Z("14010136562101652"),
      new Z("30361566041660613"),
      new Z("1064122116235164222"),
      new Z("1354465546206645132"),
      new Z("1626613640500155056"),
      new Z("144063133620460566064"),
      new Z("10063636240645406233515"),
      new Z("10114351255652662661245"),
      new Z("11406334566055365366500"),
      new Z("11406334566055365366501"),
      new Z("12616604301406016036306"));
  }
}
