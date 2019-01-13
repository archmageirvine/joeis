// Copyright (c) 2004, Hewlett-Packard Development Company, L.P. 
// 
// Permission is granted free of charge to copy, modify, use and distribute
// this software  provided you include the entirety of this notice in all
// copies made.
// 
// THIS SOFTWARE IS PROVIDED ON AN AS IS BASIS, WITHOUT WARRANTY OF ANY
// KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION,
// WARRANTIES THAT THE SUBJECT SOFTWARE IS FREE OF DEFECTS, MERCHANTABLE, FIT
// FOR A PARTICULAR PURPOSE OR NON-INFRINGING.   HEWLETT-PACKARD ASSUMES
// NO RISK AS TO THE QUALITY AND PERFORMANCE OF THE SOFTWARE.
// SHOULD THE SOFTWARE PROVE DEFECTIVE IN ANY RESPECT, 
// HEWLETT-PACKARD ASSUMES NO COST OR LIABILITY FOR ANY
// SERVICING, REPAIR OR CORRECTION.  THIS DISCLAIMER OF WARRANTY CONSTITUTES
// AN ESSENTIAL PART OF THIS LICENSE. NO USE OF ANY SUBJECT SOFTWARE IS
// AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.
// 
// UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WHETHER TORT (INCLUDING,
// WITHOUT LIMITATION, NEGLIGENCE OR STRICT LIABILITY), CONTRACT, OR
// OTHERWISE, SHALL HEWLETT-PACKARD BE LIABLE FOR ANY DIRECT, INDIRECT, SPECIAL,
// INCIDENTAL, OR CONSEQUENTIAL DAMAGES OF ANY CHARACTER WITH RESPECT TO THE
// SOFTWARE INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOSS OF GOODWILL, WORK
// STOPPAGE, LOSS OF DATA, COMPUTER FAILURE OR MALFUNCTION, OR ANY AND ALL
// OTHER COMMERCIAL DAMAGES OR LOSSES, EVEN IF HEWLETT-PACKARD SHALL
// HAVE BEEN INFORMED OF THE POSSIBILITY OF SUCH DAMAGES.
// THIS LIMITATION OF LIABILITY SHALL NOT APPLY TO LIABILITY RESULTING
// FROM HEWLETT-PACKARD's NEGLIGENCE TO THE EXTENT APPLICABLE
// LAW PROHIBITS SUCH LIMITATION.  SOME JURISDICTIONS DO NOT ALLOW THE
// EXCLUSION OR LIMITATION OF INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THAT
// EXCLUSION AND LIMITATION MAY NOT APPLY TO YOU.
// 

package irvine.math.cr;

/**
 * A scientific notation representation of an approximation to a constructive real.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
public class StringFloatRep {
  
  /**
   * The sign associated with this approximation.  May be -1, _1, or zero.
   */
  private final int mSign;
  /**
   * A string representation of the mantissa.  The decimal point is implicitly
   * to the left of the string of digits, and is not explicitly represented.
   */ 
  private final String mMantissa;
  /**
   * The radix of the representation.  Also the base of the exponent field.
   */
  private final int mRadix;
  /**
   * The mantissa is scaled by <code>radix^exponent</code>.
   */
  private final int mExponent;

  StringFloatRep(final int s, final String m, final int r, final int e) {
    mSign = s;
    mMantissa = m;
    mRadix = r;
    mExponent = e;
  }

  @Override
  public String toString() {
    return (mSign < 0 ? "-" : "") + mMantissa + "E" + Integer.toString(mExponent) + (mRadix == 10 ? "" : "(radix " + mRadix + ")");
  }
}
