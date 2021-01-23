package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A010353 Base-9 Armstrong or narcissistic numbers (written in base 10).
 * @author Sean A. Irvine
 */
public class A010353 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010353() {
    super(Z.ONE, Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.SIX, Z.SEVEN, Z.EIGHT,
      new Z("41"),
      new Z("50"),
      new Z("126"),
      new Z("127"),
      new Z("468"),
      new Z("469"),
      new Z("1824"),
      new Z("8052"),
      new Z("8295"),
      new Z("9857"),
      new Z("1198372"),
      new Z("3357009"),
      new Z("3357010"),
      new Z("6287267"),
      new Z("156608073"),
      new Z("156608074"),
      new Z("403584750"),
      new Z("403584751"),
      new Z("586638974"),
      new Z("3302332571"),
      new Z("42256814922"),
      new Z("42256814923"),
      new Z("114842637961"),
      new Z("155896317510"),
      new Z("552468844242"),
      new Z("552468844243"),
      new Z("647871937482"),
      new Z("686031429775"),
      new Z("686033024097"),
      new Z("1212041747339"),
      new Z("320659684133768"),
      new Z("2717892501113815"),
      new Z("4756225997157666"),
      new Z("6774649666149786"),
      new Z("37860400025315399"),
      new Z("157971147790033100"),
      new Z("29433987159556011216"),
      new Z("39172976026972151857"),
      new Z("175339949258468788828"),
      new Z("1828017958471661276001"),
      new Z("1828017958471661276002"),
      new Z("1854585265671831254178"),
      new Z("152485824660312142632447"),
      new Z("152485824660312142632448"),
      new Z("153883752730136060093378"),
      new Z("916767170213059160164793"),
      new Z("1520549243223774953668208"),
      new Z("628740460999264727921582627"),
      new Z("4997059916255135935307115147"),
      new Z("4997059916255135935307115148")
    );
  }
}
