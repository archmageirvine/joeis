// Copyright (c) 1999, Silicon Graphics, Inc. -- ALL RIGHTS RESERVED 
// 
// Permission is granted free of charge to copy, modify, use and distribute
// this software  provided you include the entirety of this notice in all
// copies made.
// 
// THIS SOFTWARE IS PROVIDED ON AN AS IS BASIS, WITHOUT WARRANTY OF ANY
// KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION,
// WARRANTIES THAT THE SUBJECT SOFTWARE IS FREE OF DEFECTS, MERCHANTABLE, FIT
// FOR A PARTICULAR PURPOSE OR NON-INFRINGING.   SGI ASSUMES NO RISK AS TO THE
// QUALITY AND PERFORMANCE OF THE SOFTWARE.   SHOULD THE SOFTWARE PROVE
// DEFECTIVE IN ANY RESPECT, SGI ASSUMES NO COST OR LIABILITY FOR ANY
// SERVICING, REPAIR OR CORRECTION.  THIS DISCLAIMER OF WARRANTY CONSTITUTES
// AN ESSENTIAL PART OF THIS LICENSE. NO USE OF ANY SUBJECT SOFTWARE IS
// AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.
// 
// UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WHETHER TORT (INCLUDING,
// WITHOUT LIMITATION, NEGLIGENCE OR STRICT LIABILITY), CONTRACT, OR
// OTHERWISE, SHALL SGI BE LIABLE FOR ANY DIRECT, INDIRECT, SPECIAL,
// INCIDENTAL, OR CONSEQUENTIAL DAMAGES OF ANY CHARACTER WITH RESPECT TO THE
// SOFTWARE INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOSS OF GOODWILL, WORK
// STOPPAGE, LOSS OF DATA, COMPUTER FAILURE OR MALFUNCTION, OR ANY AND ALL
// OTHER COMMERCIAL DAMAGES OR LOSSES, EVEN IF SGI SHALL HAVE BEEN INFORMED OF
// THE POSSIBILITY OF SUCH DAMAGES.  THIS LIMITATION OF LIABILITY SHALL NOT
// APPLY TO LIABILITY RESULTING FROM SGI's NEGLIGENCE TO THE EXTENT APPLICABLE
// LAW PROHIBITS SUCH LIMITATION.  SOME JURISDICTIONS DO NOT ALLOW THE
// EXCLUSION OR LIMITATION OF INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THAT
// EXCLUSION AND LIMITATION MAY NOT APPLY TO YOU.
// 
// These license terms shall be governed by and construed in accordance with
// the laws of the United States and the State of California as applied to
// agreements entered into and to be performed entirely within California
// between California residents.  Any litigation relating to these license
// terms shall be subject to the exclusive jurisdiction of the Federal Courts
// of the Northern District of California (or, absent subject matter
// jurisdiction in such courts, the courts of the State of California), with
// venue lying exclusively in Santa Clara County, California. 

package irvine.math.cr;

import java.io.Serializable;

/**
 * Unary functions on constructive reals implemented as objects.
 * The <tt>execute</tt> member computes the function result.
 * Unary function objects on constructive reals inherit from
 * <code>UnaryCRFunction</code>.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
public abstract class UnaryCrFunction implements Serializable {

  /**
   * Evaluate the function at a value.
   * @param x argument to function
   * @return result of function
   */
  public abstract CR execute(final CR x);

  /**
   * Compose this function with <tt>f2</tt>.
   * @param function function to compose with this function
   * @return composition function
   */
  public UnaryCrFunction compose(final UnaryCrFunction function) {
    return new Composition(this, function);
  }

  /**
   * Compute the inverse of this function, which must be defined
   * and strictly monotone on the interval [<tt>low</tt>, <tt>high</tt>].
   * The resulting function is defined only on the image of
   * [<tt>low</tt>, <tt>high</tt>].
   * The original function may be either increasing or decreasing.
   * @param low low end
   * @param high high end
   * @return inverse function
   */
  public UnaryCrFunction inverseMonotone(final CR low, final CR high) {
    return low.compareTo(high) < 0
      ? new InverseMonotone(this, low, high)
      : new InverseMonotone(this, high, low);
  }

  /**
   * Compute the derivative of a function.
   * The function must be defined on the interval [<tt>low</tt>, <tt>high</tt>],
   * and the derivative must exist, and must be continuous and
   * monotone in the open interval [<tt>low</tt>, <tt>high</tt>].
   * The result is defined only in the open interval.
   * @param low low end
   * @param high high end
   * @return derivative function
   */
  public UnaryCrFunction monotoneDerivative(final CR low, final CR high) {
    return new MonotoneDerivative(this, low, high);
  }

}

